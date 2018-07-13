/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The storage account key regenerate parameters.
 */
@ApiModel(description = "The storage account key regenerate parameters.")

public class StorageAccountRegenerteKeyParameters {
  @SerializedName("keyName")
  private String keyName = null;

  public StorageAccountRegenerteKeyParameters keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * The storage account key name.
   * @return keyName
  **/
  @ApiModelProperty(required = true, value = "The storage account key name.")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageAccountRegenerteKeyParameters storageAccountRegenerteKeyParameters = (StorageAccountRegenerteKeyParameters) o;
    return Objects.equals(this.keyName, storageAccountRegenerteKeyParameters.keyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageAccountRegenerteKeyParameters {\n");
    
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
