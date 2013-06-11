
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Created complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Created">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}Audit">
 *       &lt;attribute name="XPath" type="{http://www.CIP4.org/JDFSchema_2_0}XPath" />
 *       &lt;attribute name="ref" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="TemplateVersion" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="TemplateID" type="{http://www.CIP4.org/JDFSchema_2_0}shortString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Created")
public class Created
    extends Audit
    implements Serializable
{

    @XmlAttribute(name = "XPath")
    protected String xPath;
    @XmlAttribute
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF ref;
    @XmlAttribute(name = "TemplateVersion")
    protected String templateVersion;
    @XmlAttribute(name = "TemplateID")
    protected String templateID;

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.ref = value;
    }

    /**
     * Gets the value of the templateVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * Sets the value of the templateVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateVersion(String value) {
        this.templateVersion = value;
    }

    /**
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

}
