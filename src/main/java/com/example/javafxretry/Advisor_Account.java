package com.example.javafxretry;

public class Advisor_Account extends Accounts {

    private String Agency;
    private String[] Blank_ID_List;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Advisor_Account(String Username_Entered, String Password_Entered, String Role_Entered, String Name_Entered, String Address_Entered, int Phone_Number_Entered, String Agency_Entered) {
        super(Username_Entered, Password_Entered, Role_Entered, Name_Entered, Address_Entered, Phone_Number_Entered); //Get the entered value from the GUI

        //Add SQL injection validation
        String temp = Agency_Entered.toUpperCase();
        if (temp.contains("INSERT") || temp.contains("SELECT")){
            String Message = "SQL injection detected. Fuck off.";
        }
        else{
            Set_Agency(Agency_Entered);
        }
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Setters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    void Set_Agency(String Agency_Entered){
        Agency = Agency_Entered;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Getters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    String Get_Agency(){
        return Agency;
    }

    String[] Get_Blank_ID_List(){
        return Blank_ID_List;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- The rest --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Sell_Blank, View_Advisor_Report, Print_Advisor_Report, Create_Self_Report
}


