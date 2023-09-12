// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.photos;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Reason for the complaint: '0' - spam, '1' - child pornography, '2' - extremism, '3' - violence, '4' - drug propaganda, '5' - adult material, '6' - insult, abuse, '8' - suicide calls
 */
public enum ReportReason implements EnumParam {
    @SerializedName("0")
    SPAM(0),

    @SerializedName("1")
    CHILD_PORNOGRAPHY(1),

    @SerializedName("2")
    EXTREMISM(2),

    @SerializedName("3")
    VIOLENCE(3),

    @SerializedName("4")
    DRUG_PROPAGANDA(4),

    @SerializedName("5")
    ADULT_MATERIAL(5),

    @SerializedName("6")
    INSULT_ABUSE(6),

    @SerializedName("8")
    SUICIDE_CALLS(8);

    private final Integer value;

    ReportReason(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
