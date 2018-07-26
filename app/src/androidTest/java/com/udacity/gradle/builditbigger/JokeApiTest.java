package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class JokeApiTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void endpointReturnsJokeTest(){
        String joke = JokeApi.getJokeFromApi();
        Assert.assertFalse(TextUtils.isEmpty(joke));
    }

    @Test
    public void asyncTaskRetrievesJokeTest(){
        Context context = mainActivityTestRule.getActivity().getApplicationContext();
        MainActivity.EndpointsAsyncTask asyncTask = mainActivityTestRule.getActivity().new EndpointsAsyncTask();
        String joke = asyncTask.doInBackground(context);
        Assert.assertFalse(TextUtils.isEmpty(joke));

    }
}