<template>
  
</template>

<script>
import Landmark from "@/services/AuthService.js";
export default  {
  data() {
    return {
      landmark: [],
      value: "",
    };
  },

  created() {
    Landmark.searchLandmark(day, location, venueType)
  },

 
};


</script>

<style>

</style>