// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * UpdateClientsStatus object
 */
public class UpdateClientsStatus implements Validable {
    /**
     * Error code
     */
    @SerializedName("error_code")
    private Integer errorCode;

    /**
     * Error description
     */
    @SerializedName("error_desc")
    private String errorDesc;

    /**
     * Client ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    public Integer getErrorCode() {
        return errorCode;
    }

    public UpdateClientsStatus setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public UpdateClientsStatus setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UpdateClientsStatus setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorDesc, errorCode, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateClientsStatus updateClientsStatus = (UpdateClientsStatus) o;
        return Objects.equals(errorDesc, updateClientsStatus.errorDesc) &&
                Objects.equals(errorCode, updateClientsStatus.errorCode) &&
                Objects.equals(id, updateClientsStatus.id);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UpdateClientsStatus{");
        sb.append("errorDesc='").append(errorDesc).append("'");
        sb.append(", errorCode=").append(errorCode);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
