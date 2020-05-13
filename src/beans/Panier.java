/**
 * Panier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans;

public class Panier  implements java.io.Serializable {
    private java.lang.String auteur;

    private int id;

    private int idd;

    private java.lang.String image;

    private java.lang.String nom;

    private int prix;

    private int quantite;

    public Panier() {
    }

    public Panier(
           java.lang.String auteur,
           int id,
           int idd,
           java.lang.String image,
           java.lang.String nom,
           int prix,
           int quantite) {
           this.auteur = auteur;
           this.id = id;
           this.idd = idd;
           this.image = image;
           this.nom = nom;
           this.prix = prix;
           this.quantite = quantite;
    }


    /**
     * Gets the auteur value for this Panier.
     * 
     * @return auteur
     */
    public java.lang.String getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this Panier.
     * 
     * @param auteur
     */
    public void setAuteur(java.lang.String auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the id value for this Panier.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Panier.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the idd value for this Panier.
     * 
     * @return idd
     */
    public int getIdd() {
        return idd;
    }


    /**
     * Sets the idd value for this Panier.
     * 
     * @param idd
     */
    public void setIdd(int idd) {
        this.idd = idd;
    }


    /**
     * Gets the image value for this Panier.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this Panier.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the nom value for this Panier.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Panier.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the prix value for this Panier.
     * 
     * @return prix
     */
    public int getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Panier.
     * 
     * @param prix
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }


    /**
     * Gets the quantite value for this Panier.
     * 
     * @return quantite
     */
    public int getQuantite() {
        return quantite;
    }


    /**
     * Sets the quantite value for this Panier.
     * 
     * @param quantite
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Panier)) return false;
        Panier other = (Panier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auteur==null && other.getAuteur()==null) || 
             (this.auteur!=null &&
              this.auteur.equals(other.getAuteur()))) &&
            this.id == other.getId() &&
            this.idd == other.getIdd() &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            this.prix == other.getPrix() &&
            this.quantite == other.getQuantite();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        _hashCode += getId();
        _hashCode += getIdd();
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        _hashCode += getPrix();
        _hashCode += getQuantite();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Panier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans", "Panier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "idd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "quantite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
