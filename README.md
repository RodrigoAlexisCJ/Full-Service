# Order Gateway API

## Catalog Service

This API allows you to check the catalog of products.

The API is available at `http://localhost:9191`

### Endpoints

- [Orders](#Orders)
  - [Get all orders](#Get-all-orders)
  - [Get products by category](#Get-products-by-category)

### Orders

#### Get all orders

**`GET /orders`**

Returns a list of products from the inventory.

**Status codes**
| Status code | Description |
|-----------------|-----------------------------------------------------|
| 200 OK | Indicates a successful response. |
| 404 Not Found | Indicates that the parameters provided are invalid. |

Example response:

```
[
    {
        "id": 1,
        "name": "mobile",
        "category": "electronics",
        "color": "white",
        "price": 20000.0
    },
    {
        "id": 2,
        "name": "T-Shirt",
        "category": "clothes",
        "color": "black",
        "price": 999.0
    },
    ...
]
```

### Get products by category

**`GET /orders/:category`**

Returns a single product from the inventory.

**Parameters**

| Name            | Type    | In    | Required | Description                                      |
| --------------- | ------- | ----- | -------- | ------------------------------------------------ |
| `category`     | string | path  | Yes      | Specifies the category of products you want to be returned. It can be one of: clothes, electronics. |

**Status codes**

| Status code   | Description                                               |
| ------------- | --------------------------------------------------------- |
| 200 OK        | Indicates a successful response.                          |
| 404 Not Found | Indicates that there are not products with that specified category. |

Example response:

```
[
    {
        "id": 1,
        "name": "mobile",
        "category": "electronics",
        "color": "white",
        "price": 20000.0
    },
    {
        "id": 4,
        "name": "Laptop",
        "category": "electronics",
        "color": "gray",
        "price": 50000.0
    },
    ...
]
```
