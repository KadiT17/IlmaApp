package com.example.opilane.ilmaapp;


import android.os.AsyncTask:
import android.util.Log;
import org.json.JSONObject;
import java.util.Date;

import android.provider.ContactsContract;

public class functions {


    private static final  String OPPEN_WEATHER_MAP_URL="http://apt.opernweathermap.org/data/2.5/weather?lat=@s&lon=@s&units=metric";
    private static final String OPEN_WEATHER_MAP_API="43ba29400be2bf7e9f3218e0e91d933a";



    private static String setWeatherIcon(int actualId, long sunrise, long sunset){
    }
        int id= actualId/100;
        String icon ="";
        if (actualId == 800){
            long currentTime = new Date().getTime();
            if (currentTime>= sunrise && currentTime<sunset){
                icon = "&#xf00d;";

            }
            else{
                icon="&#xf02e;";
            }


        }
        else {
            switch (id){
                case 2 : icon = "&#xf0le;";
                     break;
                case 3 : icon ="&#xf0lc;";
                     break;
                case 5 : icon ="&#xf019;";
                     break;
                case 6 : icon ="&#xf01b;";
                     break;
                case 7 : icon ="&#xf014;";
                     break;
                case 8 : icon ="&#xf013;";


            }

        }
        return icon;

        private interface class placeId




























    }

}
