/*
spoonacular API

Testing ProductsAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package spoonacular

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/ddsky/spoonacular-api-clients/go"
)

func Test_spoonacular_ProductsAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test ProductsAPIService AutocompleteProductSearch", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.ProductsAPI.AutocompleteProductSearch(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService ClassifyGroceryProduct", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.ProductsAPI.ClassifyGroceryProduct(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService ClassifyGroceryProductBulk", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.ProductsAPI.ClassifyGroceryProductBulk(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService GetComparableProducts", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var upc string

		resp, httpRes, err := apiClient.ProductsAPI.GetComparableProducts(context.Background(), upc).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService GetProductInformation", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id int32

		resp, httpRes, err := apiClient.ProductsAPI.GetProductInformation(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService ProductNutritionByIDImage", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id int32

		resp, httpRes, err := apiClient.ProductsAPI.ProductNutritionByIDImage(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService ProductNutritionLabelImage", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id int32

		resp, httpRes, err := apiClient.ProductsAPI.ProductNutritionLabelImage(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService ProductNutritionLabelWidget", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id int32

		resp, httpRes, err := apiClient.ProductsAPI.ProductNutritionLabelWidget(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService SearchGroceryProducts", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.ProductsAPI.SearchGroceryProducts(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService SearchGroceryProductsByUPC", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var upc string

		resp, httpRes, err := apiClient.ProductsAPI.SearchGroceryProductsByUPC(context.Background(), upc).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test ProductsAPIService VisualizeProductNutritionByID", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id int32

		resp, httpRes, err := apiClient.ProductsAPI.VisualizeProductNutritionByID(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
