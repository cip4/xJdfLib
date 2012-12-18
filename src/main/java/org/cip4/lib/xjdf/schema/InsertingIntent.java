
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}InsertList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="GlueType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Method" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertingIntent", propOrder = {
    "insertList"
})
public class InsertingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "InsertList")
    protected List<InsertList> insertList;
    @XmlAttribute(name = "GlueType")
    @XmlSchemaType(name = "anySimpleType")
    protected String glueType;
    @XmlAttribute(name = "Method")
    @XmlSchemaType(name = "anySimpleType")
    protected String method;

    /**
     * Gets the value of the insertList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertList }
     * 
     * 
     */
    public List<InsertList> getInsertList() {
        if (insertList == null) {
            insertList = new ArrayList<InsertList>();
        }
        return this.insertList;
    }

    /**
     * Gets the value of the glueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlueType() {
        return glueType;
    }

    /**
     * Sets the value of the glueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlueType(String value) {
        this.glueType = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

}
