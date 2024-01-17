'use client';
import React, { useState } from 'react';
import { TextField } from '@mui/material';

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
    <div className="flex justify-center items-center">
      <form
        onSubmit={handleSubmit}
        className="flex flex-col gap-8 bg-tertiary/80 text-secondary px-12 md:px-16 py-8 rounded-md"
      >
        <label className="flex items-center gap-2">
          <div>
            <input
              type="radio"
              name="gender"
              value="male"
              checked={formData.gender === 'male'}
              onChange={handleChange}
              className="mx-2 cursor-pointer scale-150 accent-accent"
            />
            <span className="">Male</span>
          </div>
          <div>
            <input
              type="radio"
              name="gender"
              value="female"
              checked={formData.gender === 'female'}
              onChange={handleChange}
              className="mx-2 cursor-pointer scale-150 accent-accent"
            />
            <span className="">Female</span>
          </div>
        </label>

        <label>
          <input
            placeholder="Age"
            className="bg-primary border-b outline-none rounded-sm px-1"
            inputMode="numeric"
            name="age"
            value={formData.age}
            onChange={handleChange}
          />
        </label>

        <label>
          <input
            placeholder="Height (cm)"
            className="bg-primary border-b outline-none rounded-sm px-1"
            inputMode="numeric"
            name="height"
            value={formData.height}
            onChange={handleChange}
          />
        </label>

        <label>
          <input
            placeholder="Weight (kg)"
            className="bg-primary border-b outline-none rounded-sm px-1"
            inputMode="numeric"
            name="weight"
            value={formData.weight}
            onChange={handleChange}
          />
        </label>

        <button
          type="submit"
          className="bg-primary text-xl border border-1 active:bg-primary/50 px-4 py-1 rounded-lg text-secondary m-2"
        >
          Submit
        </button>
      </form>
    </div>
  );
};

export default Form;
