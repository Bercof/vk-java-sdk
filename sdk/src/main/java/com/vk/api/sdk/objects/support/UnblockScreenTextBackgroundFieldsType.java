// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum UnblockScreenTextBackgroundFieldsType implements EnumParam {
    @SerializedName("text_background")
    TEXT_BACKGROUND("text_background");

    private final String value;

    UnblockScreenTextBackgroundFieldsType(String value) {
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
