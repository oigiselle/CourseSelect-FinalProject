package com.ggslvdr.courseselect_finalproject.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ggslvdr.courseselect_finalproject.R;
import com.ggslvdr.courseselect_finalproject.activity.FirstMenu;

import java.util.Objects;


public class ProfileActivity extends AppCompatActivity {
    private Spinner countries;
    private static final String PREFERENCES_ARCHIVE = "PreferencesArchive";


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        countries = findViewById(R.id.spinner);

        spinnerValues();


        ImageButton savebtn = findViewById(R.id.savebtn);
        ImageButton closebtn = findViewById(R.id.closebtnProfile);
        EditText editFName = findViewById(R.id.TextFName);
        EditText editLName = findViewById(R.id.editTextLName);
        EditText editEmail = findViewById(R.id.editTextEmail);
        EditText editPhone = findViewById(R.id.editTextPhone);
        EditText editAddress = findViewById(R.id.editTextAddress);
        EditText editCity = findViewById(R.id.editTextTextCity);
        EditText editPostal = findViewById(R.id.editTextPostal);
        TextView helloStudent = findViewById(R.id.helloTextViewP);

        savebtn.setOnClickListener(view -> {
            SharedPreferences preferences = getSharedPreferences(PREFERENCES_ARCHIVE, 0);
            SharedPreferences.Editor editor = preferences.edit();
            String spinnerValues = countries.getSelectedItem().toString();



            if(Objects.requireNonNull(editFName.getText()).toString().equals("")){
                Toast.makeText(getApplicationContext(), "First Name cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Objects.requireNonNull(editLName.getText()).toString().equals("")){
                Toast.makeText(getApplicationContext(), "Last Name cannot be empty", Toast.LENGTH_LONG).show();
            } else if (editLName.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(), "Last Name cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Objects.requireNonNull(editEmail.getText()).toString().equals("")){
            Toast.makeText(getApplicationContext(), "Email cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Objects.requireNonNull(editPhone.getText()).toString().equals("")){
                Toast.makeText(getApplicationContext(), "Phone Number cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Objects.requireNonNull(editAddress.getText()).toString().equals("")){
            Toast.makeText(getApplicationContext(), "Address cannot be empty", Toast.LENGTH_LONG).show();
            } else if (Objects.requireNonNull(editCity.getText()).toString().equals(""))
            {
                Toast.makeText(getApplicationContext(), "City / State cannot be empty", Toast.LENGTH_LONG).show();
            } else if (editLName.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Last Name cannot be empty", Toast.LENGTH_LONG).show();
            } else if (spinnerValues.equals("Select a country")){
                Toast.makeText(getApplicationContext(), "Select your country", Toast.LENGTH_LONG).show();
            } else {

                String fname = editFName.getText().toString();
                String lname = editLName.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editPhone.getText().toString();
                String address = editAddress.getText().toString();
                String city = editCity.getText().toString();
                String postal = Objects.requireNonNull(editPostal.getText()).toString();
                String country = spinnerValues;
                editor.putString("fname", fname);
                editor.putString("lname", lname);
                editor.putString("email", email);
                editor.putString("phone", phone);
                editor.putString("address", address);
                editor.putString("city", city);
                editor.putString("postalcode", postal);
                editor.putString("country", country);
                editor.commit();
                helloStudent.setText("Hello, " + fname +"!");
                Toast.makeText(getApplicationContext(), "Saved!                                                                                                  ", Toast.LENGTH_LONG).show();



            }
        });

        SharedPreferences preferences = getSharedPreferences(PREFERENCES_ARCHIVE, 0);
        if(preferences.contains("fname")){
            String name = preferences.getString("fname", "Student!");
            String lname = preferences.getString("lname", "");
            String email = preferences.getString("email", "");
            String phone = preferences.getString("phone", "");
            String address = preferences.getString("address", "");
            String city = preferences.getString("city", "");
            String postal = preferences.getString("postalcode", "");




            helloStudent.setText("Hello, " + name + "!");
            editFName.setText(name);
            editLName.setText(lname);
            editEmail.setText(email);
            editPhone.setText(phone);
            editAddress.setText(address);
            editCity.setText(city);
            editPostal.setText(postal);

        }else{
            helloStudent.setText("Hello, Student");
        }


        closebtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), FirstMenu.class);
            startActivity(intent);
        });
    }



    private void spinnerValues                                                                                                                                               () {
        String[] countriesList = new String[]{
                "Select a country", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia", "Botswana", "Brazil", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Chad", "Chile", "China", "Colombia", "Congo", "Cook Islands", "Costa Rica", "Cote D Ivoire", "Croatia", "Cruise Ship", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia", "French West Indies", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kuwait", "Kyrgyz Republic", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Namibia", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda", "Saint Pierre &amp; Miquelon", "Samoa", "San Marino", "Satellite", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "South Africa", "South Korea", "Spain", "Sri Lanka", "St Kitts &amp; Nevis", "St Lucia", "St Vincent", "St. Lucia", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor L'Este", "Togo", "Tonga", "Trinidad &amp; Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks &amp; Caicos", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Venezuela", "Vietnam", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (
                        this, android.R.layout.simple_spinner_item, countriesList
                );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countries.setAdapter(adapter);
    }

}