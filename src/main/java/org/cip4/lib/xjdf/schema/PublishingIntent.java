
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PublishingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;attribute name="ContentDataRefs" type="{http://www.CIP4.org/JDFSchema_2_0}IDREFS" />
 *       &lt;attribute name="ContentListRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="IssueType" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="IssueDate" type="{http://www.CIP4.org/JDFSchema_2_0}dateTime" />
 *       &lt;attribute name="IssueName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="Circulation" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishingIntent")
public class PublishingIntent
    extends IntentType
    implements Serializable
{

    @XmlAttribute(name = "ContentDataRefs")
    @XmlIDREF
    protected List<Object> contentDataRefs;
    @XmlAttribute(name = "ContentListRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF contentListRef;
    @XmlAttribute(name = "IssueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    @XmlAttribute(name = "IssueDate")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.DateTime.class)
    protected org.cip4.lib.xjdf.type.DateTime issueDate;
    @XmlAttribute(name = "IssueName")
    protected String issueName;
    @XmlAttribute(name = "Circulation")
    protected Integer circulation;

    /**
     * Gets the value of the contentDataRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentDataRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentDataRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getContentDataRefs() {
        if (contentDataRefs == null) {
            contentDataRefs = new ArrayList<Object>();
        }
        return this.contentDataRefs;
    }

    /**
     * Gets the value of the contentListRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getContentListRef() {
        return contentListRef;
    }

    /**
     * Sets the value of the contentListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentListRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.contentListRef = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.DateTime getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(org.cip4.lib.xjdf.type.DateTime value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueName() {
        return issueName;
    }

    /**
     * Sets the value of the issueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueName(String value) {
        this.issueName = value;
    }

    /**
     * Gets the value of the circulation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCirculation() {
        return circulation;
    }

    /**
     * Sets the value of the circulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCirculation(Integer value) {
        this.circulation = value;
    }

}
