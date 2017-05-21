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
public class contact {
    private name contactName;
    private String contactDetails;
    private String contactPhone;
    private String contactEmail;
    private streetAddress contactAddress;
    private website contactWebsite;
    
    public contact(name name, String details, String phone, streetAddress address)
    {
        this.contactName = name;
        this.contactDetails = details;
        this.contactPhone = phone;
        this.contactAddress = address;
    }

    public contact(name name, String details, String phone, String email, streetAddress address)
    {
        this.contactName = name;
        this.contactDetails = details;
        this.contactPhone = phone;
        this.contactEmail = email;
        this.contactAddress = address;
    }
    
    public contact(name name, String details, String phone, String email, streetAddress address, website website)
    {
        this.contactName = name;
        this.contactDetails = details;
        this.contactPhone = phone;
        this.contactEmail = email;
        this.contactAddress = address;
        this.contactWebsite = website;
    }
    
    /**
     * @return the contactName
     */
    public name getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(name contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the contactDetails
     */
    public String getContactDetails() {
        return contactDetails;
    }

    /**
     * @param contactDetails the contactDetails to set
     */
    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    /**
     * @return the contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * @param contactPhone the contactPhone to set
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * @return the contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
        
    }

    /**
     * @param contactEmail the contactEmail to set
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * @return the contactAddress
     */
    public streetAddress getContactAddress() {
        return contactAddress;
    }

    /**
     * @param contactAddress the contactAddress to set
     */
    public void setContactAddress(streetAddress contactAddress) {
        this.contactAddress = contactAddress;
    }

    /**
     * @return the contactWebsite
     */
    public website getContactWebsite() {
        return contactWebsite;
    }

    /**
     * @param contactWebsite the contactWebsite to set
     */
    public void setContactWebsite(website contactWebsite) {
        this.contactWebsite = contactWebsite;
    }
    
    
}
