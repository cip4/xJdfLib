
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="Packaging">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumPackaging" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="URLSchemes" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SubmissionMethods")
public class SubmissionMethods
    implements Serializable
{

    @XmlAttribute(name = "Packaging")
    protected List<EnumPackaging> packagings;
    @XmlAttribute(name = "URLSchemes")
    protected List<String> urlSchemes;

    /**
     * Gets the value of the packagings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumPackaging }
     * 
     * 
     */
    public List<EnumPackaging> getPackagings() {
        if (packagings == null) {
            packagings = new ArrayList<EnumPackaging>();
        }
        return this.packagings;
    }

    /**
     * Gets the value of the urlSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURLSchemes() {
        if (urlSchemes == null) {
            urlSchemes = new ArrayList<String>();
        }
        return this.urlSchemes;
    }

}
