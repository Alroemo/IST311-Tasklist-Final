/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

/** 
 *
 * @author wbm5061
 */
public class streetAddress {
    private String houseNumber;
    private String street;
    private city city;
    
    public streetAddress(String houseNumber, String street, city city)
    {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }

    /** 
     * @return the houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * @param houseNumber the houseNumber to set
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public city getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(city city) {
        this.city = city;
    }
    
}
