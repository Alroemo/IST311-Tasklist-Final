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
public class website extends URL{
    private contact websiteOwner;
    
    public website(String URL, contact websiteOwner)
    {
        this.siteURL = URL;
        this.websiteOwner = websiteOwner;
    }

    /**
     * @return the websiteOwner
     */
    public contact getWebsiteOwner() {
        return websiteOwner;
    }

    /**
     * @param websiteOwner the websiteOwner to set
     */
    public void setWebsiteOwner(contact websiteOwner) {
        this.websiteOwner = websiteOwner;
    }
    
    
    
}
