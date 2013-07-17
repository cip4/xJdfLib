
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PreflightParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreflightParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreflightParams", propOrder = {
    "testPool",
    "actionPool"
})
public class PreflightParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "TestPool")
    protected List<TestPool> testPool;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPool;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;

    /**
     * Gets the value of the testPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestPool }
     * 
     * 
     */
    public List<TestPool> getTestPool() {
        if (testPool == null) {
            testPool = new ArrayList<TestPool>();
        }
        return this.testPool;
    }

    /**
     * Gets the value of the actionPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionPool }
     * 
     * 
     */
    public List<ActionPool> getActionPool() {
        if (actionPool == null) {
            actionPool = new ArrayList<ActionPool>();
        }
        return this.actionPool;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

}
