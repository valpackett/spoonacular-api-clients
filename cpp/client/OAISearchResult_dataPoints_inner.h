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
 * OAISearchResult_dataPoints_inner.h
 *
 * 
 */

#ifndef OAISearchResult_dataPoints_inner_H
#define OAISearchResult_dataPoints_inner_H

#include <QJsonObject>

#include <QJsonValue>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISearchResult_dataPoints_inner : public OAIObject {
public:
    OAISearchResult_dataPoints_inner();
    OAISearchResult_dataPoints_inner(QString json);
    ~OAISearchResult_dataPoints_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getKey() const;
    void setKey(const QString &key);
    bool is_key_Set() const;
    bool is_key_Valid() const;

    QJsonValue getValue() const;
    void setValue(const QJsonValue &value);
    bool is_value_Set() const;
    bool is_value_Valid() const;

    bool isShow() const;
    void setShow(const bool &show);
    bool is_show_Set() const;
    bool is_show_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_key;
    bool m_key_isSet;
    bool m_key_isValid;

    QJsonValue m_value;
    bool m_value_isSet;
    bool m_value_isValid;

    bool m_show;
    bool m_show_isSet;
    bool m_show_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISearchResult_dataPoints_inner)

#endif // OAISearchResult_dataPoints_inner_H
