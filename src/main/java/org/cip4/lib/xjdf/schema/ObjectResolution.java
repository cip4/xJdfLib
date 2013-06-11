
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ObjectResolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectResolution">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="AntiAliasing" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *       &lt;attribute name="SourceObjects">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.CIP4.org/JDFSchema_2_0}EnumSourceObjects" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Resolution" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ObjectTags" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectResolution")
public class ObjectResolution
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "AntiAliasing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String antiAliasing;
    @XmlAttribute(name = "SourceObjects")
    protected List<EnumSourceObjects> sourceObjects;
    @XmlAttribute(name = "Resolution")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair resolution;
    @XmlAttribute(name = "ObjectTags")
    protected List<String> objectTags;

    /**
     * Gets the value of the antiAliasing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiAliasing() {
        return antiAliasing;
    }

    /**
     * Sets the value of the antiAliasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiAliasing(String value) {
        this.antiAliasing = value;
    }

    /**
     * Gets the value of the sourceObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumSourceObjects }
     * 
     * 
     */
    public List<EnumSourceObjects> getSourceObjects() {
        if (sourceObjects == null) {
            sourceObjects = new ArrayList<EnumSourceObjects>();
        }
        return this.sourceObjects;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(org.cip4.lib.xjdf.type.XYPair value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the objectTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectTags() {
        if (objectTags == null) {
            objectTags = new ArrayList<String>();
        }
        return this.objectTags;
    }

}
