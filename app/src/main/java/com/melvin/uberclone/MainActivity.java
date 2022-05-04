package com.melvin.uberclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity

{

    public TextView registration;
    public EditText firstName;
    public EditText secondName;
    public EditText userName, emailAddress, phoneNumber;
    public Button submit;


    //Creating variables for the Database reference
    DatabaseReference myDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registration = findViewById(R.id.tv_registration_id);
        firstName = findViewById(R.id.et_first_name_id);
        secondName = findViewById(R.id.et_second_name_id);
        userName = findViewById(R.id.et_User_name_id);
        emailAddress = findViewById(R.id.et_email_address_id);
        phoneNumber = findViewById(R.id.et_phone_number_id);
        submit = findViewById(R.id.btn_submit_id);

       /* //Initialising the database reference */
        myDatabaseReference = FirebaseDatabase.getInstance().getReference().child("Users");


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                uploadInformation ();
                submit();


            }
        });
    }

    private void uploadInformation() {

        //Converting the user input into String

        String myFirstName = firstName.getText().toString().trim();
        String mySecondName = secondName.getText().toString().trim();
        String myUserName = userName.getText().toString().trim();
        String myEMailAddress = emailAddress.getText().toString().trim();
        String myPhoneNumber = phoneNumber.getText().toString().trim();

        //To ensure that all the fields are filled correctly (not empty)

        if(!TextUtils.isEmpty(myFirstName)
        && !TextUtils.isEmpty(mySecondName)
        && !TextUtils.isEmpty(myUserName)
        && !TextUtils.isEmpty(myEMailAddress)
        && !TextUtils.isEmpty(myPhoneNumber))
        {
            //If user has not left any spaces... Do this...

            //Generating key for each user
            String userKey = myDatabaseReference.push().getKey();

            //Uploading information to the database
            UserDetails userDetails = new UserDetails(myFirstName, mySecondName, myUserName, myEMailAddress, myPhoneNumber);

            //Creating a new child to store details of each specific user
            myDatabaseReference.child(userKey).setValue(userDetails);

            //setting the user details in the database
            firstName.setText("");
            secondName.setText("");
            userName.setText("");
            emailAddress.setText("");
            phoneNumber.setText("");

            //for successful uplaod

            Toast.makeText(this, "Succesfully uploaded", Toast.LENGTH_SHORT).show();


        }

        else
        {
           //if any field is left empty.. display the toast below

            Toast.makeText(this, "Fill all the fields above and then try again", Toast.LENGTH_SHORT).show();

        }

    }

    //Method when submit button is clicked, it goes to the next activity
    private void submit() {
        Intent intent = (new Intent(MainActivity.this, GoogleMap.class));
        startActivity(intent);




    }


}
