
    
    const orderId = window.location.search.slice(1).split("=")[1];
    fetchOrderData(orderId);

    function fetchOrderData(id) {
      // Simulate fetching data from server - replace with actual API call
      const orderData = {
        id: 1, 
        customerName: "Sam Smith",
        customerEmail: "s.smith@example.com",
        billingAddress: "...",
        shippingAddress: "...",
        items: [
          { product: "Cupcakes", quantity: 3, price: 9.00 },
          { product: "Brownie", quantity: 5, price: 25.00 }
        ]
      };
      
      // Update UI with fetched data
      document.getElementById("order-id").textContent = orderData.id;
      document.getElementById("customer-name").textContent = orderData.customerName;
      document.getElementById("customer-email").textContent = orderData.customerEmail;
      document.getElementById("billing-address").textContent = orderData.billingAddress;
      document.getElementById("shipping-address").textContent = orderData.shippingAddress;
      
      const tbody = document.getElementById("order-items").getElementsByTagName("tbody")[0];
      orderData.items.forEach(item => {
        const row = document.createElement("tr");
        row.innerHTML = `<td>${item.product}</td><td>${item.quantity}</td><td>$${item.price.toFixed(2)}</td>`;
        tbody.appendChild(row);
      });
    }
