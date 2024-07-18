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
 * OAIRecipeInformation_winePairing.h
 *
 * 
 */

#ifndef OAIRecipeInformation_winePairing_H
#define OAIRecipeInformation_winePairing_H

#include <QJsonObject>

#include "OAIRecipeInformation_winePairing_productMatches_inner.h"
#include <QList>
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIRecipeInformation_winePairing_productMatches_inner;

class OAIRecipeInformation_winePairing : public OAIObject {
public:
    OAIRecipeInformation_winePairing();
    OAIRecipeInformation_winePairing(QString json);
    ~OAIRecipeInformation_winePairing() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getPairedWines() const;
    void setPairedWines(const QList<QString> &paired_wines);
    bool is_paired_wines_Set() const;
    bool is_paired_wines_Valid() const;

    QString getPairingText() const;
    void setPairingText(const QString &pairing_text);
    bool is_pairing_text_Set() const;
    bool is_pairing_text_Valid() const;

    QSet<OAIRecipeInformation_winePairing_productMatches_inner> getProductMatches() const;
    void setProductMatches(const QSet<OAIRecipeInformation_winePairing_productMatches_inner> &product_matches);
    bool is_product_matches_Set() const;
    bool is_product_matches_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> m_paired_wines;
    bool m_paired_wines_isSet;
    bool m_paired_wines_isValid;

    QString m_pairing_text;
    bool m_pairing_text_isSet;
    bool m_pairing_text_isValid;

    QSet<OAIRecipeInformation_winePairing_productMatches_inner> m_product_matches;
    bool m_product_matches_isSet;
    bool m_product_matches_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRecipeInformation_winePairing)

#endif // OAIRecipeInformation_winePairing_H
