// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.asr;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Which model to use for recognition. `neutral` -- general purpose (interviews, TV shows, etc.), `spontaneous` -- for NSFW audios (slang, profanity, etc.)
 */
public enum ProcessModel implements EnumParam {
    @SerializedName("neutral")
    NEUTRAL("neutral"),

    @SerializedName("spontaneous")
    SPONTANEOUS("spontaneous");

    private final String value;

    ProcessModel(String value) {
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
