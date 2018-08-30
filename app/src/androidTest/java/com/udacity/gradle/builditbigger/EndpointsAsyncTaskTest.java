package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    final CountDownLatch latch = new CountDownLatch(1);

    @Test
    public void testAsync() throws Throwable {

        final EndpointsAsyncTask task = new EndpointsAsyncTask() {

            @Override
            protected String doInBackground(Void... voids) {
                return super.doInBackground(voids);
            }

            @Override
            protected void onPostExecute(String s) {
                assertNotNull(s);
                assertFalse(s.equals(""));
                latch.countDown();
            }
        };

        Runnable runTest =  new Runnable() {
            @Override
            public void run() {
                task.execute();
            }
        };

        runTest.run();

        latch.await();
    }
}
