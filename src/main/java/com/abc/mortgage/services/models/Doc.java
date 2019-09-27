
package com.abc.mortgage.services.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "partnerId",
    "entityId",
    "name",
    "firstName",
    "partnerType",
    "birthDate",
    "bankEmployeeAuthorizationRequired",
    "street",
    "houseNumber",
    "zipCode",
    "city",
    "branchId",
    "customerNumber",
    "vipstate",
    "id",
    "_version_"
})
public class Doc {

    @JsonProperty("partnerId")
    private List<Integer> partnerId = null;
    @JsonProperty("entityId")
    private List<Integer> entityId = null;
    @JsonProperty("name")
    private List<String> name = null;
    @JsonProperty("firstName")
    private List<String> firstName = null;
    @JsonProperty("partnerType")
    private List<Integer> partnerType = null;
    @JsonProperty("birthDate")
    private List<String> birthDate = null;
    @JsonProperty("bankEmployeeAuthorizationRequired")
    private List<Boolean> bankEmployeeAuthorizationRequired = null;
    @JsonProperty("street")
    private List<String> street = null;
    @JsonProperty("houseNumber")
    private List<Integer> houseNumber = null;
    @JsonProperty("zipCode")
    private List<Integer> zipCode = null;
    @JsonProperty("city")
    private List<String> city = null;
    @JsonProperty("branchId")
    private List<Integer> branchId = null;
    @JsonProperty("customerNumber")
    private List<Integer> customerNumber = null;
    @JsonProperty("vipstate")
    private List<String> vipstate = null;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("partnerId")
    public List<Integer> getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partnerId")
    public void setPartnerId(List<Integer> partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("entityId")
    public List<Integer> getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(List<Integer> entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("name")
    public List<String> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    @JsonProperty("firstName")
    public List<String> getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("partnerType")
    public List<Integer> getPartnerType() {
        return partnerType;
    }

    @JsonProperty("partnerType")
    public void setPartnerType(List<Integer> partnerType) {
        this.partnerType = partnerType;
    }

    @JsonProperty("birthDate")
    public List<String> getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(List<String> birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("bankEmployeeAuthorizationRequired")
    public List<Boolean> getBankEmployeeAuthorizationRequired() {
        return bankEmployeeAuthorizationRequired;
    }

    @JsonProperty("bankEmployeeAuthorizationRequired")
    public void setBankEmployeeAuthorizationRequired(List<Boolean> bankEmployeeAuthorizationRequired) {
        this.bankEmployeeAuthorizationRequired = bankEmployeeAuthorizationRequired;
    }

    @JsonProperty("street")
    public List<String> getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(List<String> street) {
        this.street = street;
    }

    @JsonProperty("houseNumber")
    public List<Integer> getHouseNumber() {
        return houseNumber;
    }

    @JsonProperty("houseNumber")
    public void setHouseNumber(List<Integer> houseNumber) {
        this.houseNumber = houseNumber;
    }

    @JsonProperty("zipCode")
    public List<Integer> getZipCode() {
        return zipCode;
    }

    @JsonProperty("zipCode")
    public void setZipCode(List<Integer> zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("city")
    public List<String> getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(List<String> city) {
        this.city = city;
    }

    @JsonProperty("branchId")
    public List<Integer> getBranchId() {
        return branchId;
    }

    @JsonProperty("branchId")
    public void setBranchId(List<Integer> branchId) {
        this.branchId = branchId;
    }

    @JsonProperty("customerNumber")
    public List<Integer> getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(List<Integer> customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("vipstate")
    public List<String> getVipstate() {
        return vipstate;
    }

    @JsonProperty("vipstate")
    public void setVipstate(List<String> vipstate) {
        this.vipstate = vipstate;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

 
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
