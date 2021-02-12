<template>
  <div class="hello">
    <h1>{{ travelDirections }}</h1>
  </div>
</template>
<script>
import cityAPI from "@/services/APIServices.js";
export default {
  name: "RouteMapping",
  data() {
    return {
      travelDirections: {
        startPoint: "",
        endPoint: "",
        waypoints: "",
      },
    };
  },
  created() {
    cityAPI
      .generateTravelRoute(
        this.$route.params.originQuery,
        this.$route.params.destinationQuery,
        this.$route.params.routeQuery
      )
      .then((response) => {
        this.travelDirections = response.data;
      })
      .catch((error) => {
        if (error.response) {
          ("Sorry, we're unable to generate a travel route for you at this time.");
        }
      });

    //   cityAPI.getAllLandmarks().then((response) => {
    //   this.landmarkCoordinates = response.data;
    // });
  },
};
</script>