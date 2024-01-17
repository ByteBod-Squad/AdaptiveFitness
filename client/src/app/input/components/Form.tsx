'use client';
import React, { useState } from 'react';

const Form = () => {
  const [formData, setFormData] = useState({
    gender: '',
    age: '',
    height: '',
    weight: '',
  });

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLSelectElement>
  ) => {
    const { name, value } = e.target;
    setFormData(prevData => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    console.log('Form submitted with data:', formData);
  };

  return (
    <form onSubmit={handleSubmit} className='flex flex-col items-center'>
      <label>
        Gender:
        <select name="gender" value={formData.gender} onChange={handleChange}>
          <option value="">Select Gender</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="other">Other</option>
        </select>
      </label>
      <br />

      <label>
        Age:
        <input
          type="number"
          name="age"
          value={formData.age}
          onChange={handleChange}
        />
      </label>
      <br />

      <label>
        Height:
        <input
          type="text"
          name="height"
          value={formData.height}
          onChange={handleChange}
        />
      </label>
      <br />

      <label>
        Weight:
        <input
          type="text"
          name="weight"
          value={formData.weight}
          onChange={handleChange}
        />
      </label>
      <br />

      <button type="submit">Submit</button>
    </form>
  );
};

export default Form;
