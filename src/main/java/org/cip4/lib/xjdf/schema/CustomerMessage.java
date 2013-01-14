
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ComChannel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MessageEvents" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *       &lt;attribute name="Language" type="{http://www.CIP4.org/JDFSchema_2_0}language" />
 *       &lt;attribute name="ShowList" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "comChannel"
})
@XmlRootElement(name = "CustomerMessage")
public class CustomerMessage
    implements Serializable
{

    @XmlElement(name = "ComChannel")
    protected List<ComChannel> comChannel;
    @XmlAttribute(name = "MessageEvents")
    protected List<String> messageEvents;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "ShowList")
    protected List<String> showList;

    /**
     * Gets the value of the comChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComChannel }
     * 
     * 
     */
    public List<ComChannel> getComChannel() {
        if (comChannel == null) {
            comChannel = new ArrayList<ComChannel>();
        }
        return this.comChannel;
    }

    /**
     * Gets the value of the messageEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageEvents() {
        if (messageEvents == null) {
            messageEvents = new ArrayList<String>();
        }
        return this.messageEvents;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

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

}
