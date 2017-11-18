/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView weatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        weatherDisplay = (TextView) findViewById(R.id.tv_weather_data);

        String[] weatherData = new String[]{
                "Sat Nov 18 - Sun, +5",
                "Sun Nov 19 - Broken Clouds, +1",
                "Mon Nov 20 - Mostly Sun, +3",
                "Tue Nov 21 - Ice, +2",
                "Wed Nov 22 - Rain and Snow, +1"};

        for (String weather : weatherData) {
            weatherDisplay.append(weather + "\n\n\n");
        }
    }
}