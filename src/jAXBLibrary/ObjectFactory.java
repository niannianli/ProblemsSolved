package jAXBLibrary;

//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.ipsoft.example.coding
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Sites.Site }
	 * 
	 */
	public Sites.Site createSitesSite() {
		return new Sites.Site();
	}

	/**
	 * Create an instance of {@link Sites.Site.Hosts }
	 * 
	 */
	public Sites.Site.Hosts createSitesSiteHosts() {
		return new Sites.Site.Hosts();
	}

	/**
	 * Create an instance of {@link Sites }
	 * 
	 */
	public Sites createSites() {
		return new Sites();
	}

	/**
	 * Create an instance of {@link Sites.Site.Hosts.Host }
	 * 
	 */
	public Sites.Site.Hosts.Host createSitesSiteHostsHost() {
		return new Sites.Site.Hosts.Host();
	}

}