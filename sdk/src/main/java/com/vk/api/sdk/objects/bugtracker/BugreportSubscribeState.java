// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.bugtracker;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * BugreportSubscribeState object
 */
public class BugreportSubscribeState implements Validable {
    @SerializedName("can_set_subscribe")
    @Required
    private Boolean canSetSubscribe;

    @SerializedName("is_subscribed")
    private Boolean isSubscribed;

    @SerializedName("set_subscribe_hash")
    private String setSubscribeHash;

    public Boolean getCanSetSubscribe() {
        return canSetSubscribe;
    }

    public BugreportSubscribeState setCanSetSubscribe(Boolean canSetSubscribe) {
        this.canSetSubscribe = canSetSubscribe;
        return this;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public BugreportSubscribeState setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
        return this;
    }

    public String getSetSubscribeHash() {
        return setSubscribeHash;
    }

    public BugreportSubscribeState setSetSubscribeHash(String setSubscribeHash) {
        this.setSubscribeHash = setSubscribeHash;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(setSubscribeHash, isSubscribed, canSetSubscribe);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugreportSubscribeState bugreportSubscribeState = (BugreportSubscribeState) o;
        return Objects.equals(canSetSubscribe, bugreportSubscribeState.canSetSubscribe) &&
                Objects.equals(setSubscribeHash, bugreportSubscribeState.setSubscribeHash) &&
                Objects.equals(isSubscribed, bugreportSubscribeState.isSubscribed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("BugreportSubscribeState{");
        sb.append("canSetSubscribe=").append(canSetSubscribe);
        sb.append(", setSubscribeHash='").append(setSubscribeHash).append("'");
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append('}');
        return sb.toString();
    }
}
