package com.adobe.aem.guides.wknd.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.settings.SlingSettingsService;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

import java.util.Optional;

@Model(adaptables = Resource.class)
public class Offer {

    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values="No resourceType")
    protected String resourceType;

    @OSGiService
    private SlingSettingsService settings;
    @SlingObject
    private Resource currentResource;
    @SlingObject
    private ResourceResolver resourceResolver;
    
    
    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String country;

    @ValueMapValue(injectionStrategy=InjectionStrategy.OPTIONAL)
    protected String oldprice;
    
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    protected String newprice;
    
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    protected String email;
    
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    protected String image;
    
    
    public String getCountry() {
        return country;
    }
    
      
    public String getOldPrice() {
        return StringUtils.isNotBlank(this.oldprice) ? this.oldprice : null;
    }
    
    public String getNewPrice() {
    	return StringUtils.isNotBlank(this.newprice) ? this.newprice : null;
    }
    
    public String getEmail() {
    	return StringUtils.isNotBlank(this.email) ? this.email : null; 
    }
    
    public String getImage() {
    	return StringUtils.isNotBlank(this.image) ? this.image : null;
    }
  

}
