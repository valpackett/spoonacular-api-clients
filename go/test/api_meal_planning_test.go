/*
spoonacular API

Testing MealPlanningAPIService

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

func Test_spoonacular_MealPlanningAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test MealPlanningAPIService AddMealPlanTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string

		resp, httpRes, err := apiClient.MealPlanningAPI.AddMealPlanTemplate(context.Background(), username).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService AddToMealPlan", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string

		resp, httpRes, err := apiClient.MealPlanningAPI.AddToMealPlan(context.Background(), username).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService AddToShoppingList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string

		resp, httpRes, err := apiClient.MealPlanningAPI.AddToShoppingList(context.Background(), username).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService ClearMealPlanDay", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var date string

		resp, httpRes, err := apiClient.MealPlanningAPI.ClearMealPlanDay(context.Background(), username, date).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService ConnectUser", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.MealPlanningAPI.ConnectUser(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService DeleteFromMealPlan", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var id int32

		resp, httpRes, err := apiClient.MealPlanningAPI.DeleteFromMealPlan(context.Background(), username, id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService DeleteFromShoppingList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var id int32

		resp, httpRes, err := apiClient.MealPlanningAPI.DeleteFromShoppingList(context.Background(), username, id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService DeleteMealPlanTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var id int32

		resp, httpRes, err := apiClient.MealPlanningAPI.DeleteMealPlanTemplate(context.Background(), username, id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GenerateMealPlan", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.MealPlanningAPI.GenerateMealPlan(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GenerateShoppingList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var startDate string
		var endDate string

		resp, httpRes, err := apiClient.MealPlanningAPI.GenerateShoppingList(context.Background(), username, startDate, endDate).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GetMealPlanTemplate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var id int32

		resp, httpRes, err := apiClient.MealPlanningAPI.GetMealPlanTemplate(context.Background(), username, id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GetMealPlanTemplates", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string

		resp, httpRes, err := apiClient.MealPlanningAPI.GetMealPlanTemplates(context.Background(), username).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GetMealPlanWeek", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string
		var startDate string

		resp, httpRes, err := apiClient.MealPlanningAPI.GetMealPlanWeek(context.Background(), username, startDate).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MealPlanningAPIService GetShoppingList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var username string

		resp, httpRes, err := apiClient.MealPlanningAPI.GetShoppingList(context.Background(), username).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
