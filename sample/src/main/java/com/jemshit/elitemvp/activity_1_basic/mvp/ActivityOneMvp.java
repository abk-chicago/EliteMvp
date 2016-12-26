/*
 * Copyright (c) 2016 Jemshit Iskanderov.
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
 *
 */

package com.jemshit.elitemvp.activity_1_basic.mvp;

import com.jemshit.library.ElitePresenter;
import com.jemshit.library.EliteView;

public interface ActivityOneMvp {
    interface View extends EliteView{
        void showSum(String sum);
    }

    abstract class Presenter extends ElitePresenter<ActivityOneMvp.View> {
        public abstract void calculateSum(int input1, int input2);
    }
}