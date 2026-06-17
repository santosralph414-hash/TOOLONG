let cart = [];

function showCart() {
  document.getElementById("cartModal").style.display = "block";
  updateCart();
}

function closeModal() {
  document.getElementById("cartModal").style.display = "none";
}

function updateCart() {
  const cartList = document.getElementById("cartItems");
  cartList.innerHTML = "";
  if (cart.length === 0) {
    cartList.innerHTML = "<li>Your cart is empty.</li>";
  } else {
    cart.forEach(item => {
      const li = document.createElement("li");
      li.textContent = item;
      cartList.appendChild(li);
    });
  }
}

function selectRole() {
  const role = prompt("Enter your role (e.g., renter, admin):");
  if (role) {
    alert("You selected role: " + role);
  }
}
