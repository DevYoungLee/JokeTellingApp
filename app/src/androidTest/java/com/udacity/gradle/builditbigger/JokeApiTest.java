package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class JokeApiTest {

    @Test
    public void endpointReturnsJokeTest(){
        String joke = JokeApi.getJokeFromApi();
        Assert.assertFalse(TextUtils.isEmpty(joke));
    }

}