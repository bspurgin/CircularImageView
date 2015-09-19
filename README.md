CircularImageView
====
Android ImageView implementation that draws circular images with support for optional placeholder text.

### Usage

````xml
<com.subinkrishna.widget.CircularImageView
    android:id="@+id/image"
    android:layout_width="50dp"
    android:layout_height="50dp"
    android:src="@drawable/c2"

    <!-- Custom attributes -->
    app:borderWidth="2dp"
    app:borderColor="#FFF"
    app:placeholderBackgroundColor="@android:color/holo_orange_light"
    app:placeholderText="CV"
    app:placeholderTextSize="22sp"
    app:placeholderTextColor="#FFF" />
````

##### Custom Attributes

* `borderWidth` (default: `0`)
* `borderColor` (default: `#FFFFFFFF`)
* `placeholderText`
* `placeholderTextSize` (default: `0`)
* `placeholderTextColor` (default: `#FF000000`)
* `placeholderBackgroundColor` (default: `#FFDDDDDD`)

##### Java Methods

* `setBorderWidth(int unit, int size)`
* `setBorderColor(@ColorInt int color)`
* `setPlaceholder(String text)`
* `setPlaceholder(String text, @ColorInt int backgroundColor, @ColorInt int textColor)`
* `setPlaceholderTextSize(int unit, int size)`

### Download

Download the latest version from [releases][1]. Current version is 1.0.

### Samples

## License

    Copyright (C) 2015 Subinkrishna Gopi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[1]: sample