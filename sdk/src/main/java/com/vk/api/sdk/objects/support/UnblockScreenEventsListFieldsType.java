// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UnblockScreenEventsListFieldsType implements EnumParam {
    @SerializedName("events_list")
    EVENTS_LIST("events_list");

    private final String value;

    UnblockScreenEventsListFieldsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
