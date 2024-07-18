/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIProductInformation_credits.h
 *
 * 
 */

#ifndef OAIProductInformation_credits_H
#define OAIProductInformation_credits_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIProductInformation_credits : public OAIObject {
public:
    OAIProductInformation_credits();
    OAIProductInformation_credits(QString json);
    ~OAIProductInformation_credits() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    QString getLink() const;
    void setLink(const QString &link);
    bool is_link_Set() const;
    bool is_link_Valid() const;

    QString getImage() const;
    void setImage(const QString &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    QString getImageLink() const;
    void setImageLink(const QString &image_link);
    bool is_image_link_Set() const;
    bool is_image_link_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_text;
    bool m_text_isSet;
    bool m_text_isValid;

    QString m_link;
    bool m_link_isSet;
    bool m_link_isValid;

    QString m_image;
    bool m_image_isSet;
    bool m_image_isValid;

    QString m_image_link;
    bool m_image_link_isSet;
    bool m_image_link_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIProductInformation_credits)

#endif // OAIProductInformation_credits_H
