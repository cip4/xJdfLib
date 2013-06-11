
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutElementProductionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutElementProductionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ShapeDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}TestPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ActionPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}LayoutElementPart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutElementProductionParams", propOrder = {
    "shapeDef",
    "testPool",
    "actionPool",
    "layoutElementPart"
})
public class LayoutElementProductionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ShapeDef")
    protected List<ShapeDef> shapeDef;
    @XmlElement(name = "TestPool")
    protected List<TestPool> testPool;
    @XmlElement(name = "ActionPool")
    protected List<ActionPool> actionPool;
    @XmlElement(name = "LayoutElementPart")
    protected List<LayoutElementPart> layoutElementPart;

    /**
     * Gets the value of the shapeDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapeDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapeDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeDef }
     * 
     * 
     */
    public List<ShapeDef> getShapeDef() {
        if (shapeDef == null) {
            shapeDef = new ArrayList<ShapeDef>();
        }
        return this.shapeDef;
    }

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
     * Gets the value of the layoutElementPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutElementPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutElementPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutElementPart }
     * 
     * 
     */
    public List<LayoutElementPart> getLayoutElementPart() {
        if (layoutElementPart == null) {
            layoutElementPart = new ArrayList<LayoutElementPart>();
        }
        return this.layoutElementPart;
    }

}
