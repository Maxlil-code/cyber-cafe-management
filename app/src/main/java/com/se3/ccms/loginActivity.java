package com.se3.ccms;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.se3.ccms.api.ApiClient;
import com.se3.ccms.api.ApiService;
import com.se3.ccms.models.LoginModel;
import com.se3.ccms.models.UserModel;

import retrofit2.Callback;
import retrofit2.Response;

public class loginActivity extends AppCompatActivity {

    TextView loginbtn;
    EditText user_name, pass;
    boolean isAllFieldsValid = false;
    private ApiService apiService;
    private String username, password;

    @RequiresApi(api = Build.VERSION_CODES.R)



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // register views with their proper IDs.
       loginbtn = findViewById(R.id.loginbtn);
        user_name = findViewById(R.id.username_input);
        pass = findViewById(R.id.pass);

        //handle text change
        textChangeValidator();

        // handle the signin/login button
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // store the returned value of the dedicated function which checks whether the entered data is valid or if any fields are left blank.
                isAllFieldsValid = CheckAllFields();

                username = user_name.getText().toString();
                password = pass.getText().toString();


                // the boolean variable turns to be true then only the user must be proceed to the main activity
                if (isAllFieldsValid) {
                    Toast.makeText(loginActivity.this, "validated", Toast.LENGTH_SHORT).show();
                    signIn(username, password);
                }
            }
        });

    }

    private void signIn(String username, String password) {
        LoginModel login = new LoginModel(username, password);
        Log.v("Loginusername", login.getUsername());
        //UserModel user = new UserModel();

        retrofit2.Call<UserModel> loginResponseCall = ApiClient.getApiService().getLoggedUser(login);
        loginResponseCall.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(retrofit2.Call<UserModel> call, Response<UserModel> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(loginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    UserModel userModel = response.body();

                    if(userModel != null) {

                        Log.v("LoginResponse", String.valueOf(response.body()));
                        Log.v("Username", userModel.getUsername());
                        Log.v("Login Password", password);

                        userModel.setUserState(true);

                        SharedPreferences sharedPreferences = getSharedPreferences("com.se3.ccms", MODE_PRIVATE);
                        SharedPreferences.Editor myEditor = sharedPreferences.edit();

                        myEditor.putInt("iduser", userModel.getIduser());
                        myEditor.putInt("name", userModel.getName());
                        myEditor.putString("email", userModel.getEmail());
                        myEditor.putInt("login", userModel.getLogin());
                        myEditor.putString("dob", userModel.getDob());
                        myEditor.putString("password", userModel.getPassword());
                        myEditor.putBoolean("country", userModel.getCountry());
                        myEditor.putString("city", userModel.getCity());
                        myEditor.putString("status", userModel.getStatus());

                        myEditor.commit();

                        if(!userModel.getUserState()) {
                            changeUserState(userModel, userModel.getUserid());
                        }

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                startActivity(new Intent(LoginActivity.this, NavigationActivity.class));
                                finish();
                            }
                        },700);
                    } else {
                        Toast.makeText(LoginActivity.this, "This account doesn't exist!", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_LONG).show();

                }

            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Throwable " + t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

    private void changeUserState(UserModel userModel, int id) {
        Call<UserModel> changeStateResponseCall = ApiClient.getApiService().updateUser(id, userModel);
        changeStateResponseCall.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                if (response.isSuccessful()) {
                    UserModel loggedUserModel = response.body();
                    Log.v("loggedUser", String.valueOf(loggedUserModel));
                    Log.v("stateChangedResponse", String.valueOf(response.body()));
                    Log.v("UserData", String.valueOf(loggedUserModel));

                    SharedPreferences sharedPreferences = getSharedPreferences("com.se3.ccms", MODE_PRIVATE);
                    SharedPreferences.Editor myEditor = sharedPreferences.edit();

                    myEditor.putInt("iduser", loggedUserModel.getIduser());
                    myEditor.putInt("name", loggedUserModel.getName());
                    myEditor.putInt("status", loggedUserModel.getStatus());
                    myEditor.putString("login", loggedUserModel.getLogin());
                    myEditor.putString("password", loggedUserModel.getPassword());
                    myEditor.putBoolean("dob", loggedUserModel.getDob());
                    myEditor.putString("city", loggedUserModel.getCity());
                    myEditor.putString("country", loggedUserModel.getCountry());
                    myEditor.putString("email", loggedUserModel.getEmail());
                    myEditor.commit();
                } else {
                    Log.v("isStateChangedFailed", "Failed to change user state");

                }

            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Log.v("isStateChangedFResponse", "Throwable " + t.getLocalizedMessage());

            }
        });
    }

    // function which checks all the text fields are filled or not by the user.
    // when user clicks on the PROCEED button this function is triggered.
    private boolean CheckAllFields() {
        if (user_name.length() == 0) {
            user_name.setError("*required");
            user_name.requestFocus();
            return false;
        }

        if (pass.length() == 0) {
            pass.setError("*required");
            pass.requestFocus();
            return false;
        } else if (pass.length() < 8) {
            pass.setError("pass must be minimum 8 characters");
            pass.requestFocus();
            return false;
        }
        return true;
    }

    //validate form fields while typing
    private void textChangeValidator() {
        user_name.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    user_name.setError("*required");
                    user_name.requestFocus();
                }
            }
        });

        pass.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0) {
                    pass.setError("*required");
                    pass.requestFocus();
                } else if (s.length() < 8) {
                    pass.setError("pass must be minimum 8 characters");
                    pass.requestFocus();
                }
            }
        });
















        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);

    }


    public void onLoginClick(View view) {
        startActivity(new Intent(this, registerActivity.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        finish();
    }


    public void login(View view) {
        startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "Login Succesfully", Toast.LENGTH_SHORT).show();
        finish();
    }

}

