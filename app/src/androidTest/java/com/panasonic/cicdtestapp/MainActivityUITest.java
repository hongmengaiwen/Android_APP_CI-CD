// 路径：app/src/androidTest/java/com/panasonic/cicdtestapp/MainActivityUITest.java
package com.panasonic.cicdtestapp;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.junit.Test;
import org.junit.runner.RunWith;

// 指定测试运行器（AndroidJUnit4）
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    // 测试方法：验证MainActivity能否正常启动并显示核心文本
    @Test
    public void testMainActivityLaunchesSuccessfully() {
        // 启动MainActivity（使用官方推荐的ActivityScenario，替代过时的ActivityTestRule）
        ActivityScenario.launch(MainActivity.class);
    }
}