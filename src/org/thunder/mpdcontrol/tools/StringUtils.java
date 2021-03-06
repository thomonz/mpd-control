/*
 * Copyright (C) 2010-2014 The MPDroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.thunder.mpdcontrol.tools;

public class StringUtils {

    public static String getExtension(String path) {
        String[] split = path.split("\\.");
        if (split.length > 1) {
            String ext = split[split.length - 1];
            if (ext.length() <= 4) {
                return ext;
            }
        }
        return "";
    }

    public static String trim(String text) {
        return text == null ? text : text.trim();
    }

}
