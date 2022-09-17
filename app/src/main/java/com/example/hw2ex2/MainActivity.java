package com.example.hw2ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;


public class MainActivity<calorieText> extends AppCompatActivity {
    public class Burger {
        static final int BEEF = 170;
        static final int CHICKEN = 140;
        static final int VEGGIE = 150;
        static final int BACON = 90;
        static final int CHEEDAR = 120;
        static final int AMERICAN = 115;

        private int mPattyCal;
        private int mCheeseCal;
        private int mBaconCal;
        private int mSauceCal;

        public Burger() {
            mPattyCal = BEEF;
            mCheeseCal = AMERICAN;
            mBaconCal = 90;
            mSauceCal = 0;
        }

        public void setPattyCalories(int calories) {
            mPattyCal = calories;
        }

        public void setCheeseCalories(int calories) {
            mCheeseCal = calories;
        }

        public void setBaconCalories(int calories) {
            mBaconCal = calories;
        }

        public void clearProsciuttoCalories() {
            mBaconCal = 0;
        }

        public void setSauceCalories(int calories) {
            mSauceCal = calories;
        }

        public int getTotalCalories() {
            return mPattyCal + mCheeseCal + mBaconCal + mSauceCal;
        }

    }

    private void displayCalories() {

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}