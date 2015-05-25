/*
 * Copyright (C) 2014 Snowdream Mobile <yanghui1986527@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.snowdream.android.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;

public final class ActivityUtil {
    //Supress default constructor for noninstantiability
    private ActivityUtil() {
        throw new AssertionError();
    }

    /**
     * Restart the Activity
     *
     * @param activity
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void restartActivity(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            activity.recreate();
        } else {
            Intent intent = activity.getIntent();
            activity.overridePendingTransition(0, 0);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            activity.finish();

            activity.overridePendingTransition(0, 0);
            activity.startActivity(intent);
        }
    }
}
