/*
 * Copyright 2019 Algorand, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.algorand.android.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CreatedAppParams(
    @SerializedName("approval-program") val approvalProgram: String?,
    @SerializedName("clear-state-program") val clearStateProgram: String?,
    @SerializedName("creator") val creator: String?,
    @SerializedName("global-state-schema") val globalStateSchema: CreatedAppStateScheme?,
    @SerializedName("local-state-schema") val localStateSchema: CreatedAppStateScheme?
) : Parcelable
