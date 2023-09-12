// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.support;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class UnblockScreenItem {
    private JsonObject data;

    private Gson gson;

    public UnblockScreenItem(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public UnblockScreenTextBorderedFields getOneOf0() {
        return gson.fromJson(data.toString(), UnblockScreenTextBorderedFields.class);
    }

    public UnblockScreenTextBackgroundFields getOneOf1() {
        return gson.fromJson(data.toString(), UnblockScreenTextBackgroundFields.class);
    }

    public UnblockScreenButtonUnblockFields getOneOf2() {
        return gson.fromJson(data.toString(), UnblockScreenButtonUnblockFields.class);
    }

    public UnblockScreenButtonSubmitFields getOneOf3() {
        return gson.fromJson(data.toString(), UnblockScreenButtonSubmitFields.class);
    }

    public UnblockScreenHeaderFields getOneOf4() {
        return gson.fromJson(data.toString(), UnblockScreenHeaderFields.class);
    }

    public UnblockScreenModalButtonFields getOneOf5() {
        return gson.fromJson(data.toString(), UnblockScreenModalButtonFields.class);
    }

    public UnblockScreenTutorialFields getOneOf6() {
        return gson.fromJson(data.toString(), UnblockScreenTutorialFields.class);
    }

    public UnblockScreenStepperFields getOneOf7() {
        return gson.fromJson(data.toString(), UnblockScreenStepperFields.class);
    }

    public UnblockScreenButtonFields getOneOf8() {
        return gson.fromJson(data.toString(), UnblockScreenButtonFields.class);
    }

    public UnblockScreenContentBlockFields getOneOf9() {
        return gson.fromJson(data.toString(), UnblockScreenContentBlockFields.class);
    }

    public UnblockScreenSlidersFields getOneOf10() {
        return gson.fromJson(data.toString(), UnblockScreenSlidersFields.class);
    }

    public UnblockScreenEventsListFields getOneOf11() {
        return gson.fromJson(data.toString(), UnblockScreenEventsListFields.class);
    }

    public UnblockScreenButtonSupportFields getOneOf12() {
        return gson.fromJson(data.toString(), UnblockScreenButtonSupportFields.class);
    }
}
