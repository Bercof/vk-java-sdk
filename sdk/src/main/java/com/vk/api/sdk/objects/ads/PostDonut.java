// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Donut
 */
public class PostDonut implements Validable {
    /**
     * Is donut
     */
    @SerializedName("is_donut")
    private Boolean isDonut;

    public Boolean getIsDonut() {
        return isDonut;
    }

    public PostDonut setIsDonut(Boolean isDonut) {
        this.isDonut = isDonut;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDonut);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostDonut postDonut = (PostDonut) o;
        return Objects.equals(isDonut, postDonut.isDonut);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostDonut{");
        sb.append("isDonut=").append(isDonut);
        sb.append('}');
        return sb.toString();
    }
}
