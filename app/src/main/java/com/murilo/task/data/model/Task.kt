package com.murilo.task.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Task (
    //alterei as variáveis para "var" para que elas possam compor o validadeData no FormTaskFragment, originalmente eram "val"
    var id: String ="",
    var description: String ="",
    var status: Status = Status.TODO
): Parcelable