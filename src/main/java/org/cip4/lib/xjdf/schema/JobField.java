
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ShowList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="JobFormat" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="JobTemplate" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="OperatorText" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="UserText" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobField")
public class JobField
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ShowList")
    protected List<String> showList;
    @XmlAttribute(name = "JobFormat")
    protected String jobFormat;
    @XmlAttribute(name = "JobTemplate")
    protected String jobTemplate;
    @XmlAttribute(name = "OperatorText")
    protected String operatorText;
    @XmlAttribute(name = "UserText")
    protected String userText;

    /**
     * Gets the value of the showList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShowList() {
        if (showList == null) {
            showList = new ArrayList<String>();
        }
        return this.showList;
    }

    /**
     * Gets the value of the jobFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFormat() {
        return jobFormat;
    }

    /**
     * Sets the value of the jobFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFormat(String value) {
        this.jobFormat = value;
    }

    /**
     * Gets the value of the jobTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTemplate() {
        return jobTemplate;
    }

    /**
     * Sets the value of the jobTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTemplate(String value) {
        this.jobTemplate = value;
    }

    /**
     * Gets the value of the operatorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorText() {
        return operatorText;
    }

    /**
     * Sets the value of the operatorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorText(String value) {
        this.operatorText = value;
    }

    /**
     * Gets the value of the userText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserText() {
        return userText;
    }

    /**
     * Sets the value of the userText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserText(String value) {
        this.userText = value;
    }

}
